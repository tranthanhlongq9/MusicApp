<?php 
	require "connect.php";
	class Baihat{
		function Baihat($idbaihat,$tenbaihat,$hinhbaihat,$casi,$linkbaihat,$luotthich){
			$this->Idbaihat = $idbaihat;
			$this->Tenbaihat = $tenbaihat;
			$this->Hinhbaihat = $hinhbaihat;
			$this->Casi = $casi;
			$this->Linkbaihat = $linkbaihat;
			$this->Luotthich = $luotthich;
		}
	}

	$arraydanhsachbaihat = array();

	if (isset($_POST['idplaylist'])) {
		$idplaylist = $_POST['idplaylist'];
		$query = "SELECT * FROM BaiHat WHERE FIND_IN_SET('$idplaylist',IdPlayList)";
	}


	if (isset($_POST['idquangcao'])) {

		$idquangcao = $_POST['idquangcao'];
		$queryquangcao = "SELECT * FROM QuangCaoBH WHERE Id = '$idquangcao'";
		$dataquangcao = mysqli_query($con,$queryquangcao);
		$rowquangcao = mysqli_fetch_assoc($dataquangcao);
		$id = $rowquangcao['IdBaiHat'];
		$query = "SELECT * FROM BaiHat WHERE IdBaiHat = '$id'";
	}
	

	$data = mysqli_query($con,$query);
	while ($row = mysqli_fetch_assoc($data)) {
		array_push($arraydanhsachbaihat, new Baihat($row['IdBaiHat']
													,$row['TenBaiHat']
													,$row['HinhBaiHat']
													,$row['CaSi']
													,$row['LinkBaiHat']
													,$row['LuotThich']));
	}

	echo json_encode($arraydanhsachbaihat);
 ?>