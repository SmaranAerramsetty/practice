let urlVal = 'http://jsonplaceholder.typicode.com/users';
const tableData = (data) => `<td>${data}</td>`;
const tableDataAddress = data => `<td>${data.street}<br>${data.suite}<br>${data.city}<br>${data.zipcode}</td><br>Geolocation:<br>lat:${data.geo.lat}<br>long:${data.geo.lng}`;
const tableDataCompany = data => `<td><br>${data.name}<br>${data.catchPhrase}<br>${data.bs}</td>`;
$.ajax({
  url: urlVal,
  method: 'GET'
})
.done((data)=>{
    data.forEach(user=>{
        let tr = document.createElement('tr');
        tr.innerHTML = '<tr></tr>';
        document.getElementById('usersList').appendChild(tr);
        for(let key in user){
            if(user.hasOwnProperty(key)){
                let td = document.createElement('td');
                switch(key){
                    case 'address':
                        td.innerHTML = tableDataAddress(user[key]);
                        break;
                    case 'company':
                        td.innerHTML = tableDataCompany(user[key]);
                        break;
                    default:
                        td.innerHTML = tableData(user[key]);
                        break;
                }
                tr.appendChild(td);
            }
        }
        let td = document.createElement('td');
        let button = document.createElement('button');
        button.textContent = 'Delete';
        button.addEventListener('click',deleteUser);
        tr.appendChild(button);
    });
}); 
function deleteUser(s){
    document.getElementsByTagName('tbody')[0].removeChild(s.target.parentNode);
};