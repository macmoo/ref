hello = ->
  i = 'Local Variable'
  window.alert i

i = 'Global Variable'

hello()
window.alert i