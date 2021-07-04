class Person

  constructor: (@name) ->

p = new Person '山田'

Person::work = (type) ->
  window.alert "#{@name}は#{type}働いています。"
  return

p.work 'コツコツ'