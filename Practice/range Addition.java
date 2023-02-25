 public static int[] getModifiedArray(int length, int[][] queries) {
        int[] res= new int[length];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int inc=queries[i][2];
            
        res[start]+=inc;
        if(end+1<length){
        res[end+1]-=inc;
        }
        }
        
     
        int sum=0;
        for(int i=0;i<length;i++){
          sum+=res[i];
          res[i]=sum;
        }
        
        return res;
    }
