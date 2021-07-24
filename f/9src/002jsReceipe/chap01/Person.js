/**
 * @constructor
 * @classdesc メンバーに関する情報を管理します。
 * @param {string} name 名前
 * @param {date} birth 誕生日
 * @throws {InvalidArgumentsException} birthが日付型ではありません。
 * @author Yoshihiro Yamada
 * @version 1.0.0
 */
var Person = function(name, birth) {
  this._name = name;
  this._birth = birth;
};

/**
 * メンバーに関する詳細情報を表示します。
 * @param {Boolean} isDetails 詳細な情報を表示するか
 * @return {String} メンバーの詳細情報
 * @deprecated {@link Person#toString}メソッドを代わりに利用してください。
 */
Person.prototype.show = function(isDetails) {
};


/**
 * Personクラスの内容を文字列化します。
 * @return {String} メンバーの詳細情報
 */
Person.prototype.toString = function() {
};
