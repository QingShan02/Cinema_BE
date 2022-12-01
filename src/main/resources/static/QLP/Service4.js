class Service4 {
    FillTablePhim = async () => {
        let { data: result } = await axios.get("/api/phim/getAllPhim");
        $$('formP').clear();
        $$('tableP').clearAll();
        // console.log(result);
        $$('tableP').parse(result);
    }
    clickThem = async () => {
        let data = $$('formP').getValues();
        let dt = {
            maPhim: data.maPhim,
            tenPhim: data.tenPhim,
            dienVien: data.dienVien,
            namSX: data.namSX,
            daoDien: data.daoDien,
            quocGia: data.quocGia,
            thoiLuong: data.thoiLuong,
            moTa: data.moTa,
            Traller: data.Traller
        };
        let temp = await axios.post("/api/phim/insertPhim", dt);
        console.log(temp);
        this.clickNew();
        this.FillTablePhim();
    };
    clickDelete = async () => {
        let data = $$('formP').getValues();
        let temp = await axios.get("/api/phim/deletePhim", { params: { maPhim: data.maPhim } });
        console.log(temp);
        this.clickNew();
        this.FillTablePhim();
    }
    clickUpdate = async () => {
        let data = $$('formP').getValues();
        let dt = {
            maPhim: data.maPhim,
            tenPhim: data.tenPhim,
            dienVien: data.dienVien,
            namSX: data.namSX,
            daoDien: data.daoDien,
            quocGia: data.quocGia,
            thoiLuong: data.thoiLuong,
            moTa: data.moTa,
            Traller: data.Traller
        };
        let temp = await axios.post("/api/phim/updatePhim", dt);
        console.log(temp);
        this.clickNew();
        this.FillTablePhim();
    };
    clickNew = () => {
        $$('formP').clear();
    }
}
export default new Service4();