class Person
  status: '健康'
  
  constructor: (@name) ->

  toString: ->
    "#{@name}は#{@status}です。"

class BusinessPerson extends Person
  work: (type) ->
    window.alert "#{@name}は#{type}働いています。"
    return
    
  toString: ->
    "ビジネスマン #{super()}"

bp = new BusinessPerson '鈴木'
bp.work 'バリバリ'
window.alert bp.toString()