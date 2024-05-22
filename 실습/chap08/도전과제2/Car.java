package 도전과제2;

class Car {
		 private final String model;

		    public Car (String model){
		        this.model = model;
		    }
		    public String toString() {
		        return model;
		    }
		    @Override
		    public boolean equals(Object obj) {
		        if (this == obj) return true;
		        if (!(obj instanceof Car)) return false;
		        Car confignation = (Car) obj;
		       return model.equals(confignation.model);
		    }
	}


