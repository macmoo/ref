class Person

  constructor: (@name) ->

p = new Person '�R�c'

Person::work = (type) ->
  window.alert "#{@name}��#{type}�����Ă��܂��B"
  return

p.work '�R�c�R�c'