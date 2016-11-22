** ArrayList
1. difference with vector
    1) Synchronization
    2) Resize: ArrayList grow by half of its size when resized while Vector doubles the size of itself by default when grows.
    3) Performance
    4) fail-fast: First let me explain what is fail-fast: If the collection (ArrayList, vector etc) gets structurally modified by any means, except the add or remove methods of iterator, after creation of iterator then the iterator will throw ConcurrentModificationException. Structural modification refers to the addition or deletion of elements from the collection.
2. synchronize
    a)  Using Collections.synchronizedList() method
    List<String> syncal = 
             Collections.synchronizedList(new ArrayList<String>());
    
    The important point to note here is that iterator should be in synchronized block in this type of synchronization
                    synchronized(syncal) {
                    Iterator<String> iterator = syncal.iterator(); 
                    while (iterator.hasNext())
                       System.out.println(iterator.next());
                    }
                
    b) Using thread-safe variant of ArrayList: CopyOnWriteArrayList
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
    
    No need to add synchronized block
        Iterator<String> iterator = al.iterator(); 
        while (iterator.hasNext())
           System.out.println(iterator.next());
3. 构造器
public ArrayList(); 
默认的构造器，将会以默认（16）的大小来初始化内部的数组 
public ArrayList(int); 
用指定的大小来初始化内部的数组

