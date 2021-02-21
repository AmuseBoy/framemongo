package com.amuse.framemongo;

//import com.amuse.framemongo.dao.StudentMongoDbDao;
//import com.amuse.framemongo.repository.StudentRepository;
        import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootTest
class FramemongoApplicationTests {

//    @Autowired
//    private StudentRepository studentRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

//    @Autowired
//    private MongoDbDao<Student> mongoDbDao;

//    @Autowired
//    private StudentMongoDbDao studentMongoDbDao;

    @Autowired
    private IvaReqRecordMongoDbDao ivaReqRecordMongoDbDao;


    @Test
    void contextLoads() {
//            Student student = new Student();
//            student.setName("静香");
//        mongoTemplate.save(student);
//        List<Student> list = mongoTemplate.findAll(Student.class);
//
//        for(Student student : list){
//            System.out.println(student.getName());
//        }
//        Query query = new Query(Criteria.where("_id").is("5bc06f5496bfbf523859778b"));
//        Student student = mongoTemplate.findOne(query, Student.class);
//        System.out.println(student.getName());
//        Query query = new Query(Criteria.where("name").is("往往"));
//        Student student = mongoTemplate.findOne(query, Student.class);
//        System.out.println(student.getName());
//        Query query = new Query(Criteria.where("_id").is("5bc06f5496bfbf523859778b"));
//        Update update = new Update().set("name", "张三");
//        mongoTemplate.updateFirst(query, update, Student.class);
////        studentRepository.insert(student);
//        Student student = studentMongoDbDao.queryById("5bc06f5496bfbf523859778b");
//        System.out.println(student.getName());
//        //studentMongoDbDao.save(student);

//        IvaReqRecord ivaReqRecord = ivaReqRecordMongoDbDao.queryById("5f0fdc00312ac81726e1f3de");
//        System.out.println(ivaReqRecord.getInvoiceCode()+"_"+ivaReqRecord.getInvoiceNumber());

        //Criteria.where("InvoiceCode").is("011001800213");
        Query query = new Query(Criteria.where("InvoiceCode").is("011001800213"));
        query.with(Sort.by(Sort.Order.desc("_id")));
        long startTime = System.currentTimeMillis();
        IvaReqRecord ivaReqRecord = mongoTemplate.findOne(query, IvaReqRecord.class);
        if(null != ivaReqRecord)
        System.out.println(ivaReqRecord.getInvoiceCode() + ivaReqRecord.getInvoiceNumber());
        System.out.println("耗时" + (System.currentTimeMillis() - startTime) + "ms");


    }

}
