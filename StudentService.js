import axios from 'axios';

const STUDENT_API_BASE_URL ="http://localhost:8085/api/v1/student"

class StudentServices{

    getStudent()
    {
        return axios.get(STUDENT_API_BASE_URL);
    }
    createStudent(student)
    {
        return axios.post(STUDENT_API_BASE_URL,student);
    }
    getStudentById(studentId)
    {
        return axios.get(STUDENT_API_BASE_URL + '/' + studentId);
    }
    updateStudent(student, studentId){
        return axios.put(STUDENT_API_BASE_URL + '/' + studentId, student);
        
    }
    deleteStudent(studentId)
    {
        return axios.delete(STUDENT_API_BASE_URL + '/' + studentId);
    }

}
export default new StudentServices()