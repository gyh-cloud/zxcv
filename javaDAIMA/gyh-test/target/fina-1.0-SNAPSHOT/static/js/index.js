window.onload=function () {
    lay2=document.getElementById("lay2");
    //直接调用show方法
    A=setInterval("show()",1000);//定时器  名称用大写
    i=0;
    //获得所有item  计算left和top
    //items = document.getElementsByClassName("item")
    mc=document.getElementById("mc");
    //根据节点关系计算圆圈定位
    for (var j=0;j<mc.children.length;j++){
        mc.children[j].style.top = 430 - j*20 + "px";
        mc.children[j].style.left = 500 + j*25 + "px";
    }

    menu=document.getElementById("menu");
    menu_item=document.getElementById("menu_item");
    r=menu.getBoundingClientRect();
    menu_item.style.left=r.right+"px";
    menu_item.style.top=r.top+"px";
}

//手动控制lay2的滚动条交给方法自动执行
//定义方法控制滚动条
function show() {
    lay2.scrollLeft=i;//滚动条属性值  完成赋值
    i+=1200;
    if (i==3600)
        i=0;
}
function showImage(x) {
    var index=x.innerHTML; //取出当前对象内容
    i=(index-1)*1200;
    lay2.scrollLeft=i;
}
/*$(function () {
    $(".a").click(function () {

    })
})*/

function loadItems(x,id) {
    if (x==1){
        menu_item.style.display="block";
        //创建对象
        var xhr = new XMLHttpRequest();
        //发送请求*
        xhr.open("get","catalog?action=load&id="+id);
        xhr.send();
        xhr.onreadystatechange=function () {
            if (xhr.readyState== 4 && xhr.status==200){
                menu_item.innerHTML="";     //清空上一次结果
                var res = xhr.responseText;         //字符串
                res=JSON.parse(res);        //转换为对象
                for (var xb in res){
                    var div = document.createElement("div");
                    div.style.width="300px";
                    div.style.height="250px";
                    div.style.float="left";
                    var div_a = document.createElement("div");
                    div_a.style.width="270px";
                    div_a.style.height="200px";
                    div_a.style.float="left";


                    var img = document.createElement("img");
                    img.style.width="260px";
                    img.style.height="190px";
                    img.src = res[xb].logo;
                    var o=document.createElement("a");
                    o.href=res[xb].url;
                    o.appendChild(img);
                    div_a.appendChild(o);
                    /*div_a.appendChild(img);*/

                    var div_b = document.createElement("div");
                    div_b.style.width="30px";
                    div_b.style.height="10px";
                    div_b.style.float="left";
                    div_b.style.top="0px";
                    div_b.innerHTML=res[xb].cname;//createTextNode
                    div.appendChild(div_a);
                    div.appendChild(div_b);
                    menu_item.appendChild(div);
                    //处理响应结果
                   /* menu_item.innerHTML+=res[xb].cname+"==";*/
                }
            }
        }
    }else {
        menu_item.style.display="none";
    }


}


