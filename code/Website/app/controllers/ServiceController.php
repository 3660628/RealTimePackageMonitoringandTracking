<?php 

class ServiceController extends BaseController{

	public function configurations(){

		$configs=Configurations::all();

		return $configs;

	}

	public function temperature(){

		$temperatureAll=Temperature::all();

		return $temperatureAll;

	}

	public function temperatureShow($truckid,$packageid){		

		$temp = Temperature::where('packageid', $packageid)->where('truckid',$truckid)->get();

		return $temp;

	}

	public function humidity(){

		$humidityAll = Humidity::all();

		return $humidityAll;

	}
}

 ?>