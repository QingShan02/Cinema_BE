import Service from "./Service5.js";


const kh = () => ({
    view: "form",
    id: "qlkh",
    rows: [

        {
            view: "form",
            id: "formKH",
            // name: "form",
            elements: [
                {
                    cols: [
                        {
                            rows: [
                                { view: "text", label: "Mã khách hàng",labelWidth:200, id: "makh", name: "maKH", fillspace: true },
                                { view: "text", label: "Họ tên khách hàng", id: "tenKH",labelWidth:200, name: "tenKH", fillspace: true },
                                { view: "text", label: "Email", id: "email", name: "Email",labelWidth:200, fillspace: true },
                                { view: "text", label: "Số điện thoại", id: "sodt", name: "soDT",labelWidth:200, fillspace: true, options: [] },
                                { view: "text", label: "Địa chỉ", id: "diachi", name: "DiaChi",labelWidth:200, fillspace: true, options: [] },
                                { view: "text", label: "Mật khẩu", id: "matkhau",labelWidth:200, name: "matKhau", fillspace: true },

                            ]
                        },
                        {
//                            rows: [
//                                {
//                                    view: "button",
//                                    label: "Thêm",
//                                    click: Service.clickThem
//                                },
//                                {
//                                    view: "button",
//                                    label: "Xóa",
//                                    click:Service.clickDelete
//                                },
//                                {
//                                    view: "button",
//                                    label: "Sửa",
//                                    click:Service.clickUpdate
//                                },
//                                {
//                                    view:"button",
//                                    label:"New",
//                                    click:Service.clickNew
//                                }
//                            ]
                        }
                    ]
                }

            ],
        },
        {
            view: "datatable",
            id: "bangKH",
            columns: [
                { id: "maKH", header: "Mã khách hàng", fillspace: true },
                { id: "tenKH", header: "Tên khách hàng", fillspace: true },
                { id: "Email", header: "Email", fillspace: true },
                { id: "soDT", header: "Số điện thoại", fillspace: true },
                { id: "diaChi", header: "Địa chỉ", fillspace: true },
                { id: "matKhau", header: "Mật khẩu", fillspace: true },
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

export default kh();