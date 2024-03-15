import { Component } from '@angular/core';
import {Post} from "./common/post";
import {ActivatedRoute} from "@angular/router";
import {PostService} from "./services/post.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public title = 'frontend2';
  public post : Post;
  private _currentPostId: number =1;

  get currentPostId(): number {
    return this._currentPostId;
  }

  set currentPostId(value: number) {
    this._currentPostId = value;
  }
  constructor(private route : ActivatedRoute ,private postService : PostService) {
    this.post = new Post(1,1,"","");

  }

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.getPost();
    });
  }


  public getPost() {
    this.postService.getPost(this.currentPostId).subscribe(data => this.post = data);

  }
}
