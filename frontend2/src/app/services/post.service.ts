import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../common/post";



@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private httpClient: HttpClient) { }


  getPost(postId: number): Observable<Post> {

    const searchUrl = `http://localhost:8080/api/posts/${postId}`;
    return this.httpClient.get<Post>(searchUrl);

  }
}


