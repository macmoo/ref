i = 'Global Variable'

hello = ->
  i = 'Local Variable'
  window.alert i

hello()
window.alert i
