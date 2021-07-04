<?php
mb_http_output('UTF-8');
mb_internal_encoding('UTF-8');
header('Content-Type: text/xml;charset=UTF-8');
print(file_get_contents('http://zip.cgis.biz/xml/zip.php?zn='.$_GET['zip']));
