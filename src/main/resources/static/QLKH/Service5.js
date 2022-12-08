class  Service5{
    fillTableKH = async() =>{
        let {data:result} = await axios.get("/api/kh/getAllKH");
        result.forEach(s=>{s.gioiTinh = (s.gioiTinh==0)?"Nữ":"Nam"});
        $$('formKH').clear();
        $$('bangKH').clearAll();
        $$('bangKH').parse(result);
    }

    clickThemKH = async() => {
        let data = $$('formKH').getValues();
        console.log(data);
        let dt ={
 //           maKH: data.maKH,
            tenKH: data.tenKH,
            email:data.email,
            soDT:data.soDT,
            diaChi:data.diaChi,
            matKhau: data.matKhau,
            gioiTinh:data.gioiTinh

        };
        console.log(dt);
        let temp = await axios.post("/api/kh/insertKH",dt);
        console.log(temp);
        this.clickNew();
        this.fillTableKH();
    };
    clickDeleteKH = async() =>{
        let data =$$('formKH').getValues();
        let temp = await axios.get("/api/kh/deleteKH",{params:{maKH:data.maKH}});
        console.log(temp);
        this.clickNew();
        this.fillTableKH();
    }
    clickUpdateKH = async() =>{
        let data = $$('formKH').getValues();
        let dt ={
           maKH: data.maKH,
                     tenKH: data.tenKH,
                     email:data.email,
                     soDT:data.soDT,
                     diaChi:data.diaChi,
                     matKhau: data.matKhau,
                    gioiTinh:data.gioiTinh

        };
        let temp = await axios.post("/api/kh/updateKH",dt);
        console.log(temp);
        this.clickNew();
        this.fillTableKH();
    };
     clickNew = () =>{
            $$('formKH').clear();
        }

}

export default new Service5();