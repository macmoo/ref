class Person
  status: 'Œ’N'
  
  constructor: (@name) ->

  toString: ->
    window.alert "#{@name}‚Í#{@status}‚Å‚·B"

p = new Person 'R“c'
p.toString()
