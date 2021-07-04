<?php
try {
  $db = new PDO('mysql:dbname=recipe;host=127.0.0.1;charset=utf8', 
    'jsusr', 'jspass');
  $stt = $db->prepare('SELECT * FROM keywords WHERE value LIKE ?');
  $stt->bindValue(1, $_GET['term'].'%', PDO::PARAM_STR);
  $stt->execute();
  print(json_encode($stt->fetchAll(PDO::FETCH_ASSOC)));
} catch(PDOException $ex) {
  die($ex->getMessage());
}
