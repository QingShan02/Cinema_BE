class  Service{
    fillTable = async() =>{
        let {data:result} = await axios.get("/api/nd/getAllND");
        $$('formNV').clear();
        $$('bang').clearAll();
        $$('bang').parse(result);
    }
    fillChiNhanh = async() =>{
        let {data:result} = await axios.get("/api/chinhanh/getAllChiNhanh");
        let dt = result.map(s=>{
            return {id:s.maCN,
            value:"T1 Cinema - "+s.tenCN}
        });
        $$('NDmaCN').define('options',dt);
        $$('NDmaCN').render();
    }
    clickThem = async() => {
        let data = $$('formNV').getValues();
        let temp = await axios.post("/api/nd/insertND",data);
        console.log(temp);
        this.clickNew();
        this.fillTable();
    };
    clickDelete = async() =>{
        let data =$$('formNV').getValues();
        let temp = await axios.get("/api/nd/deleteND",{params:{maNguoiDung:data.maNguoiDung}});
        console.log(temp);
        this.clickNew();
        this.fillTable();
    }
    clickUpdate = async() =>{
        let data = $$('formNV').getValues();
        console.log(data);
        let temp = await axios.post("/api/nd/updateND",data);
        console.log(temp);
        //  $$('form')
        this.clickNew();
        this.fillTable();
    }
    clickNew = () =>{
        $$('formNV').clear();
    }
}
 
export default new Service();