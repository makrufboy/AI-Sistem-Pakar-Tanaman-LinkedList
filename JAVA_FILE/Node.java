class Node{
	String nama;
	String jenis;
	String perawatan;
	String lokasi;
	String media;
	int harga;
	String ukuran;
	Node next,prev;
	public Node(String nama,String jenis,String perawatan,String lokasi,String media,int harga,String ukuran){
		this.nama=nama;
		this.jenis=jenis;
		this.perawatan=perawatan;
		this.lokasi=lokasi;
		this.media=media;
		this.harga=harga;
		this.ukuran=ukuran;
	}
}

class Linkedlist extends Spakar{
	Node head,tail;
	void addLast(String a, String b, String c, String d, String e, int f, String g){
		Node baru=new Node(a,b,c,d,e,f,g);
		if(head==null){
			head=tail=baru;
		}
		else{
			tail.next=baru;
			baru.prev=tail;
			tail=baru;
		}
	}
	void delete(Node tmp){
			if (tmp.prev==null){
				tmp=tmp.next;
				head=tmp;
				head.prev=null;
			}
			else if (tmp.next==null) {
				tmp=tmp.prev;
				tail=tmp;
				tail.next=null;
			}
			else{
				tmp.next.prev=tmp.prev;
				tmp.prev.next=tmp.next;
			}
	}
	void show(){
		Node tmp=head;
		System.out.println("Jenis tanaman yang cocok:");
		while(tmp!=null){
			System.out.println("Nama tanaman: "+tmp.nama+" dengan perawatan yang cukup "+tmp.perawatan+" dan harganya di kisaran "+tmp.harga);
			tmp=tmp.next;
		}
	}
	void isi(){
		addLast("Lavender", "Bunga", "Mudah", "Dalam", "Tanah", 30000, "Kecil");
		addLast("Anthurium", "Bunga", "Mudah", "Dalam", "Air", 60000, "Kecil");
		addLast("Asoka", "Bunga", "Mudah", "Luar", "Tanah", 15000, "Sedang");
		addLast("Alamanda", "Bunga", "Mudah", "Luar", "Tanah", 25000, "Besar");
		addLast("Teratai", "Bunga", "Mudah", "Luar", "Air", 50000, "Sedang");
		addLast("Krisan", "Bunga", "Rumit", "Dalam", "Tanah", 15000, "Kecil");
		addLast("Tulip", "Bunga", "Rumit", "Dalam", "Air", 60000, "Kecil");
		addLast("Mawar", "Bunga", "Rumit", "Luar", "Tanah", 20000, "Kecil");
		addLast("Marigold", "Bunga", "Rumit", "Luar", "Tanah", 50000, "Sedang");
		addLast("Amazon Lily", "Bunga", "Rumit", "Luar", "Air", 35000, "Besar");
		addLast("Mini Kaktus", "Batang", "Mudah", "Dalam", "Tanah", 10000, "Kecil");
		addLast("Bambu Air", "Batang", "Mudah", "Dalam", "Air", 45000, "Kecil");
		addLast("Palem Bambu", "Batang", "Mudah", "Luar", "Tanah", 250000, "Sedang");
		addLast("Palem Merah", "Batang", "Mudah", "Luar", "Tanah", 35000, "Besar");
		addLast("Bonsai Sakura", "Batang", "Rumit", "Dalam", "Tanah", 200000, "Sedang");
		addLast("Kayu Urip", "Batang", "Rumit", "Luar", "Tanah", 25000, "Kecil");
		addLast("Bonsai Beringin", "Batang", "Rumit", "Luar", "Tanah", 500000, "Sedang");
		addLast("Suplir", "Daun", "Mudah", "Dalam", "Tanah", 25000, "Kecil");
		addLast("Pogostemon Stelata", "Daun", "Mudah", "Dalam", "Air", 2500, "Kecil");
		addLast("Kuping Gajah", "Daun", "Mudah", "Luar", "Tanah",50000 , "Kecil");
		addLast("Lidah Mertua", "Daun", "Mudah", "Luar", "Tanah", 25000, "Sedang");
		addLast("Apu Apu", "Daun", "Mudah", "Luar", "Air", 2000, "Kecil");
		addLast("Spider Plant", "Daun", "Rumit", "Dalam", "Tanah", 20000, "Kecil");
		addLast("Amazon Sword", "Daun", "Rumit", "Dalam", "Air", 2500, "Kecil");
		addLast("Philodendron", "Daun", "Rumit", "Luar", "Tanah", 45000, "Sedang");
		addLast("Gelombang Cinta", "Daun", "Rumit", "Luar", "Tanah", 150000, "Besar");
		addLast("Bonsai Aquascape", "Daun", "Rumit", "Luar", "Air", 100000, "Kecil");
	}
	void rekomendasijenis(){
		Node tmp=head;
		if(jawaban[0]==1){
			while(tmp!=null){
				if (tmp.jenis!="Bunga"){
					delete(tmp);
				}
				tmp=tmp.next;
			}
		}
		else if(jawaban[0]==2){
			while(tmp!=null){
				if (tmp.jenis!="Batang")
					delete(tmp);
				tmp=tmp.next;
			}
		}
		else if(jawaban[0]==3){
			while(tmp!=null){
				if (tmp.jenis!="Daun")
					delete(tmp);
				tmp=tmp.next;
			}
		}
	}
	void rekomendasiperawatan(){
		Node tmp=head;
		if(jawaban[5]==1){
			while(tmp!=null){
				if (tmp.perawatan!="Mudah")
					delete(tmp);
				tmp=tmp.next;
			}	
		}
		else if(jawaban[5]==3){
			while(tmp!=null){
				if (tmp.perawatan=="Rumit")
					delete(tmp);
				tmp=tmp.next;
			}	
		}
	}
	void rekombudget(){
		Node tmp=head;
		if(jawaban[4]==1){
			while(tmp!=null){
				if (tmp.harga>100000)
					delete(tmp);
				tmp=tmp.next;
			}
		}
		else if(jawaban[4]==2){
			while(tmp!=null){
				if (tmp.harga>500000)
					delete(tmp);
				tmp=tmp.next;
			}	
		}
	}
	void rekommedia(){
		Node tmp=head;
		if(jawaban[3]==1){
			while(tmp!=null){
				if (tmp.media!="Tanah")
					delete(tmp);
				tmp=tmp.next;
			}
		}
		else {
			while(tmp!=null){
				if (tmp.media!="Air")
					delete(tmp);
				tmp=tmp.next;
			}
		}
	}
	void rekomukuran(){
		Node tmp=head;
		if(jawaban[1]==1){
			while(tmp!=null){
				if (tmp.ukuran!="Kecil")
					delete(tmp);
				tmp=tmp.next;
			}
		}
		else if(jawaban[1]==2){
			while(tmp!=null){
				if (tmp.ukuran=="Besar")
					delete(tmp);
				tmp=tmp.next;
			}	
		}
		else if(jawaban[1]==3){
			while(tmp!=null){
				if (tmp.ukuran!="Besar")
					delete(tmp);
				tmp=tmp.next;
			}	
		}
	}
	void rekomlokasi(){
		Node tmp=head;
		if(jawaban[2]==1){
			while(tmp!=null){
				if (tmp.lokasi!="Dalam")
					delete(tmp);
				tmp=tmp.next;
			}
		}
		else{
			while(tmp!=null){
				if (tmp.ukuran=="Luar")
					delete(tmp);
				tmp=tmp.next;
			}
		}
	}
	void rekomendasi(){
		rekomendasijenis();
		rekomukuran();
		rekomlokasi();
		rekommedia();
		rekombudget();
		rekomendasiperawatan();
		
		show();

	}
}