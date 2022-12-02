import Service from "./Service.js";
const handleClickTable = (e) => {
    $$('formNV').setValues(e);
};

const nv = () => ({
    view: "form",
    id: "qlnv",
    rows: [

        {
            view: "form",
            id: "formNV",
            // name: "form",
            elements: [
                {
                    cols: [
                        {
                            rows: [
                                { view: "text", label: "Mã Người Dùng",labelWidth:200, id: "NDmaND", name: "maNguoiDung", fillspace: true },
                                { view: "text", label: "Họ tên", id: "NDhoTen",labelWidth:200, name: "tenNguoiDung", fillspace: true },
                                { view: "text", label: "Mật khẩu", id: "NDmatKhau",labelWidth:200, name: "matKhau", fillspace: true },
                                { view: "text", label: "Số điện thoại", id: "NDsoDT", name: "soDT",labelWidth:200, fillspace: true },
                                { view: "combo", label: "Chi Nhánh", id: "NDmaCN", name: "maCN" ,options:[],labelWidth:200, fillspace: true }
                            ]
                        },
                        {
                            rows: [
                                {
                                    view: "button",
                                    label: "Thêm",
                                    click: Service.clickThem
                                },
                                { 
                                    view: "button", 
                                    label: "Xóa",
                                    click:Service.clickDelete 
                                },
                                { 
                                    view: "button",
                                    label: "Sửa",
                                    click:Service.clickUpdate 
                                },
                                {
                                    view:"button",
                                    label:"New",
                                    click:Service.clickNew
                                }
                            ]
                        }
                    ]
                }

            ],
        },
        {
            view: "datatable",
            id: "bang",
            columns: [
                { id: "maNguoiDung", header: "Mã Người Dùng", fillspace: true },
                { id: "tenNguoiDung", header: "Họ tên", fillspace: true },
                { id: "matKhau", header: "Mật khẩu", fillspace: true },
                { id: "soDT", header: "Số điện thoại", fillspace: true },
                { id: "tenCN", header: "Chi Nhánh", fillspace: true },
            ],
            data: [],
            select: true,
            on: {
                onItemClick: function (id) {
                    handleClickTable(this.getSelectedItem());
                    // console.log($$('form').getValues());

                }
            },
            scrollX:false
        }

    ]
})

export default nv();