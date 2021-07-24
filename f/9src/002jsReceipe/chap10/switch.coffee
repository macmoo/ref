coffee = 'au lait'

switch coffee
  when 'black'
    window.alert 'bitter!'
  when 'latte', 'au lait'
    window.alert 'sweet!'
  else
    window.alert 'unknown'