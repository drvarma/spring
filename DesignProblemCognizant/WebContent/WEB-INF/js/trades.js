/**
 * 
 */
angular.
    /**
     * myApp Module
     *
     * Description
     */
module('myApp', ['ui.bootstrap'])
    .controller('jsonCtrl', ['$scope', '$uibModal', '$http', function($scope, $uibModal, $http) {
        $http.get('trades.json').success(function(data) {
            $scope.trades = data;
            $scope.length = data.length;
        })
        $scope.isTrue=false;
        $scope.calPL = function() {
        	$scope.isTrue=true;
            var PL = 0;
            var CumPL = 0;
            var tPL = 0;
            var diffQuantity = 0;
            var BACbuyList = [];
            var BACSellList = [];
            var IBMbuyList = [];
            var IBMSellList = [];
            var XOMbuyList = [];
            var XOMSellList = [];

            for (var i = 0; i < $scope.trades.length; i++) {
                if ($scope.trades[i].Symbol === "BAC") {
                    if ($scope.trades[i].Action === "Buy") {
                        BACbuyList.push($scope.trades[i]);
                    } else {
                        BACSellList.push($scope.trades[i]);
                    }

                } else if ($scope.trades[i].Symbol === "IBM") {
                    if ($scope.trades[i].Action === "Buy") {
                        IBMbuyList.push($scope.trades[i]);
                    } else {
                        IBMSellList.push($scope.trades[i]);
                    }

                } else if ($scope.trades[i].Symbol === "XOM") {
                    if ($scope.trades[i].Action === "Buy") {
                        XOMbuyList.push($scope.trades[i]);
                    } else {
                        XOMSellList.push($scope.trades[i]);
                    }

                }
            }
              
            var BACPL = [];
                        
            for (var i = 0; i < BACSellList.length; i++) {
            	diffQuantity = BACbuyList[i].Quantity - BACSellList[i].Quantity;
            	if(diffQuantity==0){
            		PL = (BACSellList[i].Price - BACbuyList[i].Price)*BACbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else if(diffQuantity<0){
            		PL = (BACSellList[i].Price - BACbuyList[i].Price)*BACbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else if(diffQuantity>0){
            		PL = (BACSellList[i].Price - BACbuyList[i].Price)*BACSellList[i].Quantity;
            		tPL +=PL;
            	}
            	BACPL.push(PL);
            }

            var IBMPL = [];

           for (var i = 0; i < IBMSellList.length; i++) {
            	diffQuantity = IBMbuyList[i].Quantity - IBMSellList[i].Quantity;
            	if(diffQuantity==0){
            		PL = (IBMSellList[i].Price - IBMbuyList[i].Price)*IBMbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else if(diffQuantity<0){
            		PL = (IBMSellList[i].Price - IBMbuyList[i].Price)*IBMbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else {
            		PL = (IBMSellList[i].Price - IBMbuyList[i].Price)*IBMSellList[i].Quantity;
            		tPL +=PL;
            	}
            	IBMPL.push(PL);
            }

            var XOMPL = [];

			for (var i = 0; i < XOMSellList.length; i++) {
            	diffQuantity = XOMbuyList[i].Quantity - XOMSellList[i].Quantity;
            	if(diffQuantity==0){
            		PL = (XOMSellList[i].Price - XOMbuyList[i].Price)*XOMbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else if(diffQuantity<0){
            		PL = (XOMSellList[i].Price - XOMbuyList[i].Price)*XOMbuyList[i].Quantity;
            		CumPL = CumPL+PL;
            		tPL +=PL;
            	} else {
            		PL = (XOMSellList[i].Price - XOMbuyList[i].Price)*XOMSellList[i].Quantity;
            		tPL +=PL;
            	}
            	XOMPL.push(PL);
            }
            var k=0;
            for (var i = 0; i < $scope.trades.length; i++) {
            	if($scope.trades[i].Symbol==="BAC" && $scope.trades[i].Action==="Sell"){
            		$scope.trades[i]["PL"] = BACPL[k++];

            	}
            }

            k=0;
            for (var i = 0; i < $scope.trades.length; i++) {
            	if($scope.trades[i].Symbol==="IBM" && $scope.trades[i].Action==="Sell"){
            		$scope.trades[i]["PL"] = IBMPL[k++];
            	}
            }

            k=0;
            for (var i = 0; i < $scope.trades.length; i++) {
            	if($scope.trades[i].Symbol==="XOM" && $scope.trades[i].Action==="Sell"){
            		$scope.trades[i]["PL"] = XOMPL[k++];
            	}
            }
           $scope.totalPL = tPL;
            
            /*console.log($scope.length);
            var PL=0;
            var CumPL=0;
            var diffQuantity = 0;
            var BUYQuantity = 0;
            var SELLQuantity = 0;
            if(trades.Symbol=="XOM"){
            	if(trades.Action == "BUY"){
            		BUYQuantity += trades.Quantity;
            		var BUYPrice = trades.Price;
            	} else{
            		SELLQuantity +=trades.Quantity;
            		var SELLPrice = trades.Price;
            	}

            	diffQuantity = BUYQuantity-SELLQuantity;

            	if(diffQuantity>0){
            		PL = (SELLPrice-BUYPrice)*SELLQuantity;
            	} else if(diffQuantity<0){
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	} else{
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	}
            } else if(trades.Symbol=="BAC"){
            	if(trades.Action == "BUY"){
            		BUYQuantity += trades.Quantity;
            	} else{
            		SELLQuantity +=trades.Quantity;
            	}
            	diffQuantity = BUYQuantity-SELLQuantity;

            	if(diffQuantity>0){
            		PL = (SELLPrice-BUYPrice)*SELLQuantity;
            	} else if(diffQuantity<0){
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	} else{
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	}
            } else{
            	if(trades.Action == "BUY"){
            		BUYQuantity += trades.Quantity;
            	} else{
            		SELLQuantity +=trades.Quantity;
            	}
            	diffQuantity = BUYQuantity-SELLQuantity;

            	if(diffQuantity>0){
            		PL = (SELLPrice-BUYPrice)*SELLQuantity;
            	} else if(diffQuantity<0){
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	} else{
            		PL = (SELLPrice-BUYPrice)*BUYQuantity; 
            		CumPL +=PL;
            	}
            }*/
        }
    }]);
