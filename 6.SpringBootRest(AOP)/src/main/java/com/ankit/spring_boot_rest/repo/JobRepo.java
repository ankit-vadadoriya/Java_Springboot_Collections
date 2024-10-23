package com.ankit.spring_boot_rest.repo;


import com.ankit.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

        List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}


//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "Must have good experience in core java", 2, Arrays.asList("Java", "Spring Boot")),
//            new JobPost(2, "Frontend Developer", "Experience in building process", 3, Arrays.asList("HTML", "CSS", "JavaScript")),
//            new JobPost(3, "Data Scientist", "Strong background in machine learning", 1, Arrays.asList("Python", "TensorFlow")),
//            new JobPost(4, "Network Engineer", "Design and implement in computer network", 2, Arrays.asList("Cisco", "Networking")),
//            new JobPost(5, "Mobile App Developer", "Experience in mobile app development", 3, Arrays.asList("Kotlin", "Flutter"))
//    ));
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getJob(int postId) {
//        for (JobPost job : jobs){
//            if (job.getPostId() == postId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for (JobPost jobPost1 : jobs){
//            if (jobPost1.getPostId() == jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost.getPostDesc());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        for (JobPost job : jobs){
//            if (job.getPostId() == postId){
//                jobs.remove(job);
//            }
//        }
//    }