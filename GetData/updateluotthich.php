<?php 
	require "connect.php";

	$luotthich = "1";
	$idbaihat = "1";

	$query = "SELECT LuotThich FROM BaiHat WHERE IdBaiHat = '$idbaihat'";
	$dataluotthich = mysqli_query($con,$query);
	$row = mysqli_fetch_assoc($dataluotthich);
	$tongluotthich = $row['LuotThich'];

	if (isset($luotthich)) {
		$tongluotthich = $tongluotthich + $luotthich;
		$querysum = "UPDATE BaiHat SET LuotThich = '$tongluotthich' WHERE IdBaiHat = '$idbaihat'";
		$dataupdate = mysqli_query($con,$querysum);
		if ($dataupdate) {
			echo "Success";
		}else{
			echo "Fail";
		}
	}

 ?>