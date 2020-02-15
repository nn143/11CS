package classesDemo;

public class box {
int  height, width,length; 
private int weight; 
// the constructor 
// parameters h, w, l, weight 
public box(int h, int w, int l, int kg) { 
	this.height = h; 
	this.length = l; 
	this.width = w; 
	this.weight = kg; 
}

//
public int calcVol() { 
	return height*width*length; 
}

public int calcSA() { 
	return (2*height*width + 2*width*length + 2 *height*length); 
}

}


