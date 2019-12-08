
public class node {
	  // define data field and nodes
	      private  String sData;
	       private  int iData;
		    node leftChild;
		    node rightChild;
	
		node(int iData, String sData) { // node constructor to make an instance of object
		        this.iData = iData;
		        this.sData = sData;
		    }

		/**  get data 
		 * @return the sData
		 */
		public String getsData() {
			return sData;
		}

		/** set data 
		 * @param sData the sData to set
		 */
		public void setsData(String sData) {
			this.sData = sData;
		}

		/** get item id 
		 * @return the iData
		 */
		public int getiData() {
			return iData;
		}

		/** set id item id 
		 * @param iData the iData to set
		 */
		public void setiData(int iData) {
			this.iData = iData;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */ 
		public String toString() {
			return "node [sData=" + sData + ", iData=" + iData + "]";
		}

		
}
