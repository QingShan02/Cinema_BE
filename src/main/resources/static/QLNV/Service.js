class  Service{
    fillTable = async() =>{
        let {data:result} = await axios.get("/api/nv/getAllNV");
        result.forEach(s=>{s.gioiTinh = (s.gioiTinh==0)?"Nữ":"Nam"});
        $$('form').clear();
        $$('bang').clearAll();
        $$('bang').parse(result);
    }
    fillChucVu = async() =>{
        let {data:result} = await axios.get("/api/cv/getAllCV");
        let dt = new Array();
        result.forEach(s=>{
            dt.push({
                id : s.maCV,
                value: s.tenCV
            });
        })
        $$('maCV').define('options',dt);
        $$('maCV').render();
    }
    clickThem = async() => {
        var format = webix.Date.dateToStr("%Y-%m-%d");
        let data = $$('form').getValues();
        data.ngaySinh = format(data.ngaySinh);
        let dt ={
            maNV: data.maNV,
            hoTen: data.hoTen,
            matKhau: data.matKhau,
            ngaySinh: data.ngaySinh,
            soDT: data.soDT,
            gioiTinh: data.gioiTinh,
            maCV: data.maCV
        };
        let temp = await axios.post("/api/nv/insertNV",dt);
        console.log(temp);
        //  $$('form')
        this.clickNew();
        this.fillTable();
    };
    clickDelete = async() =>{
        let data =$$('form').getValues();
        // console.log(maNV);
        let temp = await axios.get("/api/nv/deleteNV",{params:{maNV:data.maNV}});
        console.log(temp);
        this.clickNew();
        this.fillTable();
    }
    clickUpdate = async() =>{
        var format = webix.Date.dateToStr("%Y-%m-%d");
        let data = $$('form').getValues();
        data.ngaySinh = format(data.ngaySinh);
        let dt ={
            maNV: data.maNV,
            hoTen: data.hoTen,
            matKhau: data.matKhau,
            ngaySinh: data.ngaySinh,
            soDT: data.soDT,
            gioiTinh: data.gioiTinh,
            maCV: data.maCV
        };
        let temp = await axios.post("/api/nv/updateNV",dt);
        console.log(temp);
        //  $$('form')
        this.clickNew();
        this.fillTable();
    }
    clickNew = () =>{
        $$('form').clear();
    }
}
 
export default new Service();