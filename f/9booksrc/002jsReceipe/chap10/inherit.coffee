class Person
  status: '���N'
  
  constructor: (@name) ->

  toString: ->
    "#{@name}��#{@status}�ł��B"

class BusinessPerson extends Person
  work: (type) ->
    window.alert "#{@name}��#{type}�����Ă��܂��B"
    return
    
  toString: ->
    "�r�W�l�X�}�� #{super()}"

bp = new BusinessPerson '���'
bp.work '�o���o��'
window.alert bp.toString()