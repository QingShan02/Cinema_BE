import Service3 from "./Service3.js";
const chonNgay = () => (
    {
        view: "datepicker",
        label: "Chọn ngày",
        labelWidth: 100,
        id: "dateLichChieu",
        name: "dateLichChieu",
        format: "%d/%m/%Y",
        value: "2022/11/08",
        on: {
            onchange: function () {
                var format = webix.Date.dateToStr("%Y-%m-%d");
                console.log(format($$('dateLichChieu').getValue()));
            }
        }
    }
);

const formLichChieu = () => ({
    view: "form",
    id: "formLC",
    elements: [
        chonNgay(),
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
        {
            view: "timeboard",
            value: "12:45",
            id: "time",
            name: "gioBatDau",
            // on: {
            //     onchange: function (value) {
            //         let date = new Date();
            //         // let time = webix.i18n.timeFormatStr(date);
            //         var format = webix.Date.dateToStr("%h:%i %A");
            //         time = format(date);
            //         value = format(value);
            //         console.log(value, time);
            //         // console.log(date,time);
            //         if (value < time) {
            //             console.log("Không hợp lệ")
            //         } else {
            //             console.log("Hợp lệ");
            //         }
            //     }
            // }
        },
        {
            cols: [
                {
                    view: "button",
                    label: "Thêm",
                    // click: function () {
                    //     let data = $$('form').getValues();
                    //     var formatDate = webix.Date.dateToStr("%Y-%m-%d");
                    //     data.dateLichChieu = formatDate(data.dateLichChieu);
                    //     var formatTime = webix.Date.dateToStr("%G:%i");

                    //     data.time = formatTime(data.time);  //time

                    //     $$('table').parse(data);
                    // }
                },
                {
                    view: "button",
                    label: "Hủy"
                }
            ]
        }
    ]

});
const tableLichChieu = () => ({
    view: "datatable",
    id: "table",
    columns: [
        { id: "rank", header: "STT", fillspace: true },
        { id: "tenPhim", header: "Tên Phim", fillspace: true },
        { id: "giaXuatChieu", header: "Giá xuất chiếu", fillspace: true },
        { id: "gioBatDau", header: "Giờ", fillspace: true },
        { id: "tenPhong", header: "Phòng", fillspace: true },
        { id: "tenCN", header: "Phòng", fillspace: true }


    ],
    data: []
});
const lc = () => ({
    // view: "form",
    id: "qllc",
    rows: [
        // formLichChieu()
        tableLichChieu()

    ]

})

export default lc();
