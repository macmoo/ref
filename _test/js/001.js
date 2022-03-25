const param = new URLSearchParams();
param.set('hello', 'world');

const data = {
	method  : 'POST',
	headers : { 
		'Content-Type':'application/x-www-form-unlencoded; charset=utf-8'
	},	
	body    : param
};

fetch('./new.php', data)
	.then((res) => res.text())
	.then(console.log);