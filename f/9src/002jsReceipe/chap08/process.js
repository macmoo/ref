self.addEventListener('message', function(e) {
  var count = 0;
  for (var i = 1, len = e.data.target; i < len; i++) {
    if (i % e.data.num === 0) { count++; }
  }
  postMessage(count);
});
