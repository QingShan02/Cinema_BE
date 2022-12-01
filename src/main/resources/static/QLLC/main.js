import Service3 from "./Service3.js";


const formLichChieu = () => ({
    view: "form",
    id: "formLC",
    name: "formLC",
    elements: [
        {
            view: "combo",
            label: "Chi Nhánh",
            id: "chiNhanh",
            name: "chiNhanh",
            options: [],
            on: {
                onchange: function () {
                    // console.log($$('chiNhanh').getValue());
                    Service3.LoadPhong($$('chiNhanh').getValue())
                }
            }
        },
        {
            view: "combo",
            label: "Phòng",
            id: "phong",
            name: "phong",
            options: []
        },
        {
            view: "combo",
            label: "Phim",
            id: "phim",
            name: "phim",
            options: []
        },
        {
            view: "text",
            label: "Giá xuất chiếu",
            id: "cash",
            name: "giaXuatChieu",
            labelWidth: 100
        },
        // {
        //     view: "timeboard",
        //     value: "12:45",
        //     id: "time",
        //     name: "gioBatDau",
        //     // on: {
        //     //     onchange: function (value) {
        //     //         let date = new Date();
        //     //         // let time = webix.i18n.timeFormatStr(date);
        //     //         var format = webix.Date.dateToStr("%h:%i %A");
        //     //         time = format(date);
        //     //         value = format(value);
        //     //         console.log(value, time);
        //     //         // console.log(date,time);
        //     //         if (value < time) {
        //     //             console.log("Không hợp lệ")
        //     //         } else {
        //     //             console.log("Hợp lệ");
        //     //         }
        //     //     }
        //     // }
        // },
        {
            cols: [
                {
                    view: "datepicker",
                    timepicker: true,
                    label: "Chọn ngày",
                    name: "end",
                    stringResult: true,
                    format: "%d %M %Y at %H:%i"
                },
                {
                    view: "combo",
                    label: "Chi Nhánh",
                    id: "chiNhanh",
                    name: "chiNhanh",
                    options: [],
                    on: {
                        onchange: function () {
                            // console.log($$('chiNhanh').getValue());
                            Service3.LoadPhong($$('chiNhanh').getValue())
                        }
                    }
                },
                {
                    view: "combo",
                    label: "Phòng",
                    id: "phong",
                    name: "phong",
                    options: []
                },
                {
                    view: "combo",
                    label: "Phim",
                    id: "phim",
                    name: "phim",
                    options: []
                },
                {
                    view: "text",
                    label: "Giá xuất chiếu",
                    id: "cash",
                    name: "giaXuatChieu",
                    labelWidth: 100
                },
                // {
                //     view: "timeboard",
                //     value: "12:45",
                //     id: "time",
                //     name: "gioBatDau",
                //     // on: {
                //     //     onchange: function (value) {
                //     //         let date = new Date();
                //     //         // let time = webix.i18n.timeFormatStr(date);
                //     //         var format = webix.Date.dateToStr("%h:%i %A");
                //     //         time = format(date);
                //     //         value = format(value);
                //     //         console.log(value, time);
                //     //         // console.log(date,time);
                //     //         if (value < time) {
                //     //             console.log("Không hợp lệ")
                //     //         } else {
                //     //             console.log("Hợp lệ");
                //     //         }
                //     //     }
                //     // }
                // },
                {
                    cols: [
                        {
                            view: "button",
                            label: "Thêm",
                            click: function () {
                                let data = $$('formLC').getValues();
                                console.log(data);
                                let arr = data.end.split(" ");
                                let ngaychieu = {
                                    ngay: arr[0],
                                    gioBatDau: arr[1]
                                }
                                Service3.GetIDNgay(data, ngaychieu);

                                // var formatDate = webix.Date.dateToStr("%Y-%m-%d");
                                // data.dateLichChieu = formatDate(data.dateLichChieu);
                                // var formatTime = webix.Date.dateToStr("%G:%i");

                                // data.time = formatTime(data.time);  //time

                                // $$('table').parse(data);
                            }
                        },
                        {
                            view: "button",
                            label: "Hủy"
                        }
                    ]
                }
            ]
        }

    ]

});
const tableLichChieu = () => ({
    view: "datatable",
    id: "tableLC",
    columns: [
        { id: "stt", header: "STT" },
        { id: "tenPhim", header: "Tên Phim", fillspace: 2 },
        { id: "giaXuatChieu", header: "Giá xuất chiếu", fillspace: true },
        { id: "ngayChieu", header: "Ngày chiếu", fillspace: true },
        { id: "gioBatDau", header: "Giờ", fillspace: true },
        { id: "tenPhong", header: "Phòng", fillspace: true },
        { id: "tenCN", header: ["Chi Nhánh",{content:"selectFilter"}],sort:"string", fillspace: true }
    ],
    data: []
});
const lc = () => ({
    view: "form",
    id: "qllc",
    rows: [
        formLichChieu(),
        tableLichChieu()

    ]

})

export default lc();
