/* 
   Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). 
   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). 
   Посчитать сколько раз встречается каждое слово.
*/

class Main{
    public static void main(String args[]){
 
        List<String> words = new ArrayList<>();
        words.add("Space"); 
        words.add("Sun");
        words.add("Earth");
        words.add("Mars");
        words.add("Moon");
        words.add("Pluton");
        words.add("Uran");
        words.add("Neptun");
        words.add("Mars");
        words.add("Sun");
        words.add("Space");
        words.add("Space");
        int count = 0;
        int countn = 0;

        for ( String w: words)
            System.out.print(w +",");
        
        System.out.println("\r" );

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        Integer item;
       
        for (String word : words) {
            
            item = hashMap.get(word);
            
            if (item == null){
                hashMap.put(word, 1); // если нет в списке то добавить со значением 1
            }
            else{
                hashMap.put(word, item + 1); // если есть такая, то +1
            }
        }

        System.out.println("-----------------------------------------\r");

        System.out.println("All words in list: " + words.size());

        System.out.println("-----------------------------------------\r");

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() == 1){
                count++;
                System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
            }
        }
        System.out.println("Unicum words in list: " + count);

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() != 1){
                countn++;
                System.out.print(entry.getKey() + " - " + entry.getValue() + ", ");
            }
        }

        System.out.println("Not unicum words in list: " + countn);

        System.out.println("-----------------------------------------\r");

        System.out.println("Words and count:");
        System.out.println(hashMap);

        System.out.println("-----------------------------------------\r");
    }
}


/**************************************************************************************/



/*
Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. 
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. 
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), 
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля 
(имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать 
(в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
*/

class Main{
    public static void main(String args[]){
    	
        Person lika = new Person();
        lika.setName("Lika");
        lika.setNumber("89259999999");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(lika);

        System.out.println(phoneBook);
    }
}

class Person {

    private String number;
    private String name;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class PhoneBook extends ArrayList<Person> {

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Person person : this) {
            stringBuilder.append("----------------------------\n");
            stringBuilder.append("Name:" + person.getName() + "\n");
            stringBuilder.append("Number:" + person.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }

}
