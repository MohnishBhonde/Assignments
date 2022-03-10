row=window.prompt("Enter no of rows");
col=window.prompt("Enter no of columns");
function createTable() {
    

for(let i=0;i<parseInt(row,10);i++){

    {
        let x=document.getElementById("table").insertRow(row);
        for(let j=0;j<parseInt(col,10);j++){
            let y=x.inertCell(col);
            y.innerHTML="Row-"+row+"Column-"+col;
        }
    }
}
}