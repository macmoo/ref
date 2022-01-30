const userDataList = [
    { id:  2, name:'스즈키'  },
    { id: 10, name:'다나카'  },
    { id:  4, name:'사토'    },
    { id: 29, name:'다카하시'},
    { id:101, name:'오기하라'}
];

// ----------------------------
// 표시를 갱신
function updateList(){
    let listHtml = '';
    for(const data of userDataList){
        listHtml += `<li>${data.id} : ${data.name}</li>`;
    }
    document.querySelector('.user_list').innerHTML = listHtml;
}
// ----------------------------
// 오름차순으로 정렬
function sortByAscending(){
    userDataList.sort((a, b) => {
        return a.id - b.id;
    });
    updateList();
}
// ----------------------------
// 내림차순으로 정렬
function sortByDescending(){
    userDataList.sort((a, b) => {
        return b.id - a.id;
    });
    updateList();
}
// ----------------------------
// 오름차순 버튼이벤트
document.querySelector('.ascending' ).addEventListener('click', () => {
    sortByAscending();
});
// ----------------------------
// 내림차순 버튼이벤트
document.querySelector('.descending').addEventListener('click', () => {
    sortByDescending();
});
// ----------------------------
// 처음은 오름차순
sortByAscending();
// ----------------------------
