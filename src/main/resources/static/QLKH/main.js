import Service from "./Service5.js";
const handleClickTableKH = (e) => {
  e.gioiTinh = (e.gioiTinh === "Nam") ? 1 : 0;
     $$('formKH').setValues(e);
     e.gioiTinh = (e.gioiTinh == 0) ? "Nữ" : "Nam"

};

const kh = () => ({
    view: "form",
    id: "qlkh",
    rows: [

        {
            view: "form",
            id: "formKH",
            elements: [
                {
                    cols: [
                        {
                            rows: [
                                { view: "text", label: "Mã khách hàng",labelWidth:200, id: "maKH", name: "maKH", fillspace: true },
                                { view: "text", label: "Tên khách hàng", id: "tenKH",labelWidth:200, name: "tenKH", fillspace: true },
                                { view: "text", label: "Mật khẩu", id: "matKhau",labelWidth:200, name: "matKhau", fillspace: true },
                                { view: "text", label: "Email", id: "email",labelWidth:200, name: "email", fillspace: true },
                                { view: "text", label: 'Số điện thoại', id: "soDT",labelWidth:200, name: "soDT", fillspace: true },
                                { view: "text", label: "Địa chỉ", id: "diaChi", name: "diaChi",labelWidth:200, fillspace: true },
                                { view: "radio", label: "Giới tính", id: "gioiTinh",labelWidth:200, name: "gioiTinh", fillspace: true, value: 1, options: [{ "id": 1, "value": "Nam" }, { "id": 0, "value": "Nữ" }] },

                            ]
                        },
                        {
                            rows: [
                                {

                                    view: "button",
                                    label: "Thêm",
                                   click: Service.clickThemKH
                                },
                                {
                                    view: "button",
                                    label: "Xóa",
                                   click:Service.clickDeleteKH
                                },
                                {
                                    view: "button",
                                    label: "Cập nhật",
                                   click:Service.clickUpdateKH
                                },


                            ]
                        }
                    ]
                }

            ],
        },
        {
            view: "datatable",
            id: "bangKH",
            columns: [
                { id: "maKH", header: "Mã khách hàng", fillspace: true },
                { id: "tenKH", header: "Tên khách hàng", fillspace: true },
                { id: "matKhau", header: "Mật khẩu", fillspace: true },
                { id: "email", header: "Email", fillspace: true },
                { id: "soDT", header: "Số điện thoại", fillspace: true },
{ id: "diaChi", header: "Địa chỉ", fillspace: true },
                { id: "gioiTinh", header: "Giới tính", fillspace: true },

            ],
            data: [],
            select: true,
            on: {
                onItemClick: function (id) {
                    handleClickTableKH(this.getSelectedItem());

                }
            },
            scrollX:false
        }

    ]
})

export default kh();