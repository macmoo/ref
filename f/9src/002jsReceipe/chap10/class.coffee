class Person
  status: '健康'
  
  constructor: (@name) ->

  toString: ->
    window.alert "#{@name}は#{@status}です。"

p = new Person '山田'
p.toString()
