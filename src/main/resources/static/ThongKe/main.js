var data = [
    { val:70.6, type:"Số Lượng", color1: "#2ECC71", color2:"#AAB7B8" },
    { val:30.6, type:"Negative", color1: "#AAB7B8", color2:"#E74C3C" },
  ];  
var dataTable =[
    {tenCN:"Hưng Thịnh",avg:1000,count:300},
    {tenCN:"Bình Tân",avg:300,count:500},
    {tenCN:"Quang Trung",avg:1240,count:340},
]
const tableThongKe = ()=>({
    view:"datatable",
    id:"tableTK",
    columns:[
        {id:"tenCN",header:"Tên Chi Nhánh"},
        {id:"avg", header:"Tỉ lệ bán vé trong ngày"},
        {id:"count",header:"Số lượng bán hôm nay"}
    ],
    data:dataTable
})  
const tk = (e) => ({
    view: "form",
    id: "tk",
    rows: [
        {
            cols:[
                {
                    view:"template", template:"Chi Nhánh"
                },
                {
                    template:"", width:200
                },
                {
                    view: "chart",
                    donutInnerText: function (data, total) {
                        return "<span style='font-size:20px'>" + data[0].type + ":</span><br>" + data[0].val + "%";
                    },
                    type: "donut",
                    innerRadius: 70,
                    value: "#val#",
                    color: "#color1#",
                    height: 300,
                    width: 300,
                    data
                }
            ]
        },
        tableThongKe()
    ]
});
export default tk();