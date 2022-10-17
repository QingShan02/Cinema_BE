import Service from "./Service.js";
const handleClickTable = (e) => {
    e.gioiTinh = (e.gioiTinh === "Nam") ? 1 : 0;
    $$('form').setValues(e);
    e.gioiTinh = (e.gioiTinh == 0) ? "Nữ" : "Nam"
};

const nv = () => ({
    view: "form",
    id: "qlnv",
    rows: [

        {
            view: "form",
            id: "form",
            // name: "form",
            elements: [
                {
                    cols: [
                        {
                            rows: [
                                { view: "text", label: "Mã nhân viên",labelWidth:200, id: "maNV", name: "maNV", fillspace: true },
                                { view: "text", label: "Họ tên", id: "hoTen",labelWidth:200, name: "hoTen", fillspace: true },
                                { view: "radio", label: "Giới tính", id: "gioiTinh",labelWidth:200, name: "gioiTinh", fillspace: true, value: 1, options: [{ "id": 1, "value": "Nam" }, { "id": 0, "value": "Nữ" }] },
                                { view: "text", label: "Mật khẩu", id: "matKhau",labelWidth:200, name: "matKhau", fillspace: true },
                                { view: "datepicker", label: 'Ngày sinh', id: "ngaySinh",labelWidth:200, name: "ngaySinh", fillspace: true },
                                { view: "text", label: "Số điện thoại", id: "soDT", name: "soDT",labelWidth:200, fillspace: true },
                                { view: "select", label: "Tên Chức Vụ", id: "maCV", name: "maCV",labelWidth:200, fillspace: true, options: [] },
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
                { id: "maNV", header: "Mã nhân viên", fillspace: true },
                { id: "hoTen", header: "Họ tên", fillspace: true },
                { id: "gioiTinh", header: "Giới tính", fillspace: true },
                { id: "matKhau", header: "Mật khẩu", fillspace: true },
                { id: "ngaySinh", header: "Ngày sinh", fillspace: true },
                { id: "soDT", header: "Số điện thoại", fillspace: true },
                { id: "tenCV", header: "Tên Chức Vụ", fillspace: true },
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