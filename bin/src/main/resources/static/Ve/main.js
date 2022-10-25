const ve = () => ({
    view: "scrollview",
    id: 've',
    scroll: "y",
    body: {
        rows: [{
            view: "combo",
            id: "combo1",
            inputWidth: 200,
            options: {
                filter: function(tenPhim) {
                    return tenPhim.value.toString().toLowerCase().indexOf(tenPhim.toLowerCase()) !== -1
                },
                data: []
            }
        }, {

            id: 'dashboard1',
            view: "chart",
            type: "bar",
            value: "#soluong#",
            preset: "stick",
            height: 400,
            tooltip: {
                template: "Date <span class='title'>#ngay#</span><br/>Value <span class='title'>#soluong#</span>"
            },
            xAxis: {
                template: function(obj) {
                    return obj.$unit.getDate() == 15 ? webix.Date.dateToStr("%M")(obj.$unit) : ""
                },
                lineColor: function(obj) {
                    return (obj.$unit && (obj.$unit.valueOf() == (new Date(2019, 1, 1)).valueOf())) ? "#737373" : "#cfcfcf"
                },
                value: function(obj) {
                    return webix.Date.strToDate("%Y.%m.%d")(obj.ngay);
                },
                units: {
                    start: new Date(2022, 0, 1),
                    end: new Date(2022, 11, 31),
                    next: function(d) {
                        return webix.Date.add(d, 1, "day", true);
                    }
                }
            },
            yAxis: {
                start: 0,
                step: 10,
                end: 100
            },
            data: [

            ]
        }]
    }
})

export default ve();