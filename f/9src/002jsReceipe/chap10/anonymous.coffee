$ ->
  $('#logo').hover ->
    $(@).attr 'src', 'open.png'
    return
  , ->
    $(@).attr 'src', 'close.png'
    return
