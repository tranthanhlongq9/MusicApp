<?php 
	require "connect.php";

	$query = "SELECT DISTINCT * FROM Playlist ORDER BY rand(" . date("Ymd") . ") LIMIT 3";
	class PlaylistToday{
		function PlaylistToday($idplaylist,$ten,$hinh,$icon){
			$this->Idplaylist = $idplaylist;
			$this->Ten = $ten;
			$this->HinhPlaylist = $hinh;
			$this->Icon = $icon;

		}
	}
	$arrayplaylistfortoday = array();
	$data = mysqli_query($con,$query);
	while ($row = mysqli_fetch_assoc($data)){
		array_push($arrayplaylistfortoday, new PlaylistToday( $row['IdPlayList']
															,$row['Ten']
															,$row['Hinhnen']
															,$row['Hinhicon'] ));
	}
	echo json_encode($arrayplaylistfortoday);
	
 ?>