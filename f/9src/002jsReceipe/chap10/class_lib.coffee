class Person
  status: '���N'
  
  constructor: (@name) ->

  toString: ->
    window.alert "#{@name}��#{@status}�ł��B"

window.Person = Person
