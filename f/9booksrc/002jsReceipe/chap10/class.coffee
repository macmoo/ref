class Person
  status: '���N'
  
  constructor: (@name) ->

  toString: ->
    window.alert "#{@name}��#{@status}�ł��B"

p = new Person '�R�c'
p.toString()
