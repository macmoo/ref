sum = (values...) ->
  result = 0
  result += v for v in values
  result

window.alert sum 10, 20, 30