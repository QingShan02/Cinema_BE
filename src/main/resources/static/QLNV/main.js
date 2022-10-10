const nv =()=>({
    view: "form",
    id: "qlnv",
    rows: [
        {
            cols: [
                {
                    rows: [
                        {
                            view: "form",
                            id: "form",
                            name: "form",
                            rows: [
                                { view: "text", label: "Mã nhân viên", id: "maNV", name: "maNV", fillspace: true },
                                { view: "text", label: "Họ tên", id: "hoTen", name: "hoTen", fillspace: true },
                                { view: "radio", label: "Giới tính", id: "gioiTinh", name: "gioiTinh", fillspace: true, value: 1, options: [{ "id": 1, "value": "Nam" }, { "id": 0, "value": "Nữ" }] },
                                { view: "text", label: "Mật khẩu", id: "matKhau", name: "matKhau", fillspace: true },
                                { view: "datepicker", label: 'Ngày sinh', id: "ngaySinh", name: "ngaySinh", fillspace: true },
                                { view: "text", label: "Số điện thoại", id: "soDT", name: "soDT", fillspace: true },
                                { view: "text", label: "Mã CV", id: "maCV", name: "maCV", fillspace: true },
                            ]
                        }


                    ]

                },

                {
                    rows: [
                        { view: "button", label: "Chọn ảnh" },

                    ]

                },

                {
                    rows: [
                        { view: "button", label: "Thêm" },
                        { view: "button", label: "Xóa" },
                        { view: "button", label: "Sửa" },
                        { view: "button", label: "Tìm kiếm" },
                        { view: "button", label: "Cập nhật" }

                    ]
                },

            ]
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
                { id: "maCV", header: "Mã CV", fillspace: true },
            ],
            data: [],
            select: true,
            on: {
                onItemClick: function (id) {
                    handleClickTable(this.getSelectedItem());
                }
            }
        }

    ]
})

export default nv();