class Person
  constructor: (@nickname) ->
    btn = document.getElementById 'btn'
    btn.onclick = =>
      window.alert "元気かな、#{@nickname}。"

p = new Person('やまちゃん')

