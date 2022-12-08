import Service7 from "./Service7.js";

const handleClickTable = (e) => {
    $$('formTP').setValues(e);
};

const formTP = () =>({  
  view:"form",
  id:"formTP", 
    elements:[
        { view:"text", name:"maTopping", label:"Mã TP" },
        { view:"text", name:"tenTopping", label:"Tên TP" },
       	{ view:"text", name:"gia", label:"Giá" },
      	{cols:[
            { view:"button", label:"Thêm", css:"webix_danger", click: Service7.clickAdd },
            { view:"button", label:"Xóa", css:"webix_danger", click: Service7.clickDelete },
          	{ view:"button", label:"Cập nhật", css:"webix_danger", click: Service7.clickUpdate }
        ]}
    ]
});

const tableTP = () => ({
	view:"datatable", 
	id:"tableTP",
    columns:[
        { id:"hinh", header:"Hình Topping", template: "<img src='/Image/topping/#maTopping#.png' style='height:60px'/>", fillspace: true  },
        { id:"maTopping", header:"Mã Topping", fillspace: true },
        { id:"tenTopping", header:"Tên Topping", fillspace: true },
        { id:"gia", header:"Giá", fillspace: true }
    ],
    data: [],
    fixedRowHeight: false, rowLineHeight: 25, rowHeight: 80,
    select: true,
    on: {
        onItemClick: function (id) {
            handleClickTable(this.getSelectedItem());
        }
    },
    scrollX: false
})

const tp = () => ({
	view: "form",
    id: "qltp",
    rows: [
        formTP(),
        tableTP()

    ],
    scroll: true
})

export default tp();